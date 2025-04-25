# Respuestas

## 1. Herencia y Polimorfismo

### **Herencia**
- `ProductoConcreto` hereda de la clase abstracta `Producto`.

```java
public class ProductoConcreto extends Producto { ... }
```

### **Polimorfismo**
- Se aplica a través de la interfaz `ProductoImplementacion`.
  - `CamaraImplementacion` e `ImpresionImplementacion` implementan esta interfaz.
  - Se puede utilizar cualquier implementación como un `Producto` de forma polimórfica:

```java
Producto producto = new ProductoConcreto(new CamaraImplementacion(...));
```

---

## 2. ⚙️ Composición y Agregación

### **Composición**
- `Producto` tiene una implementación (`ProductoImplementacion`), que es parte fundamental de él.
- `Pedido` tiene una lista de productos (`ArrayList<Producto>`) que se consideran parte del pedido.

### **Agregación**
- `Pedido` tiene un `Cliente`, pero el cliente puede existir sin el pedido y puede ser compartido entre varios pedidos.

---



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

