# Respuestas

## 1. Herencia y Polimorfismo

- **Herencia**:

- La clase `ProductoConcreto` hereda de la clase abstracta `Producto` (abstracción del patrón Bridge).

- **Polimorfismo**:

- Se aplica al trabajar con la interfaz `ProductoImplementacion` y su uso en las diferentes implementaciones (`CamaraImplementacion`, `FotoImplementacion`, `ImpresionImplementacion`).

## 2. Composición y Agregación

- **Composición**:

  - La clase `Pedido` contiene una lista de objetos `Producto` y un objeto `Cliente`, indicando que un pedido está compuesto por productos y un cliente.

  - La clase `ImpresionImplementacion` contiene una lista de objetos `Foto`, representando que una impresión está compuesta por varias fotos.

- **Agregación**:

  - Se utiliza en la relación entre `Pedido` y `Producto`, ya que los productos pueden existir independientemente de los pedidos.

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

