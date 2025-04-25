# Respuestas

## 1. Herencia y Polimorfismo

- **Herencia**:

- La clase Camara e Impresion implementan la interfaz Producto. Esto es un ejemplo de herencia por implementación (una clase concreta implementa una interfaz).

- Esto permite que se puedan tratar diferentes clases (Camara, Impresion) como si fueran del mismo tipo (Producto).

- **Polimorfismo**:

- En el método mostrarPedido() de la clase Pedido, se recorre una lista de objetos Producto y se llama a mostrarDetalles() sin saber si se trata de una Camara o una Impresion.


## 2. Composición y Agregación

- **Composición**:

- La clase Pedido contiene una lista de Producto y también contiene directamente la instancia de Cliente.

- Como el pedido no tiene sentido sin sus productos, esta relación se considera composición.

- **Agregación**:

- En el caso de las Fotos dentro de una Impresion, también se podría considerar composición, porque las fotos están contenidas dentro de la impresión y no se reutilizan.

- Si en algún momento las Fotos se reutilizan en otras impresiones, entonces se puede reinterpretar como agregación.



## 3. ¿Cuál clase podría convertirse en una interfaz o clase abstracta para generar un modelo mucho más estructurado?

- La clase `Producto` lo cual ayuda al codigo para que sea adecuado para estructurar el modelo.

- La clase `Foto` podría convertirse en una interfaz o clase abstracta si se desea permitir diferentes tipos de fotos (por ejemplo, fotos digitales, fotos impresas, etc.) con implementaciones específicas.

## 4. ¿Qué es más conveniente para el modelo, utilizar arreglos o utilizar la estructura de datos ArrayList?

- Es más conveniente utilizar **ArrayList** porque permite manejar dinámicamente la cantidad de elementos (productos, fotos, etc.) sin necesidad de definir un tamaño fijo.  
- Esto es especialmente útil en aplicaciones donde la cantidad de elementos puede variar.

## 5. ¿Qué patrones eligió y por qué?
- **Patrón Bridge**:
  - Se utiliza en la relación entre `Producto` y `ProductoImplementacion`.  
  - Este patrón permite desacoplar la abstracción (`Producto`) de su implementación (`ProductoImplementacion`), facilitando la extensión y el mantenimiento del código.

  - Beneficio: Permite agregar nuevos tipos de productos sin modificar el código principal. También facilita que cada implementación tenga sus propios detalles internos.

- **Patrón Builder**:

  - Se aplica en la clase `Pedido` mediante la clase interna `PedidoBuilder`.  
  - Este patrón simplifica la creación de objetos complejos como `Pedido`, proporcionando un enfoque más legible y flexible para configurar sus propiedades.

  - Beneficio: Aumenta la legibilidad y evita constructores largos con muchos parámetros.

