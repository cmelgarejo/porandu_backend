## Flyway

[Flyway](https://flywaydb.org/about/) es similar a Liquibase con la diferencia de administrar cambios por medio de archivos SQL
en lugar de utilizar XML. 

### Configuraci�n

### Proyecto

- Se integra al proyecto con la habilidad de Spring Boot de autoconfigurar la herramienta al encontrar la dependencia:
```
   <dependency>
	<groupId>org.flywaydb</groupId>
	<artifactId>flyway-core</artifactId>
   </dependency>
```

### Cambios a nivel BD

- Los cambios se configurar con archivos SQL que se ubican y nombran de la siguiente forma:
`src\main\resources\db\migration\VX__[descripcion].sql`

Como ejemplo el archivo que inicializa la BD se llama:
`src\main\resources\db\migration\V1__init.sql`

Si se quiere agregar un nuevo cambio se deber�a agregar otro archivo en el mismo directorio, ejemplo:
`src\main\resources\db\migration\V2__tablasDeSucursales.sql`

### Ejecuci�n

Al levantar la aplicaci�n, Flyway se ejecuta autom�ticamente y aplica a la BD los cambios que a�n no tiene, leyendo los mismos
a partir de lo especificado en los archivos `VX__[descripcion].sql`.

## Soluci�n de Problemas
- Internamente Flyway almacena los cambios en una tabla `schema_version`, se puede borrar esta tabla en caso de
que no se est�n aplicando los cambios en la BD.

## TODO
- En la versi�n actual v0.0.2 del proyecto todavia se trabaja con JPA. Es decir no es necesario agregar cambios de la forma
descrita arriba, ya que JPA genera s�lo estos cambios. En futuras versiones se planificar� dejar de usar JPA. Por el momento
se usa Flyway para inicializar la BD y JPA para agregar nuevos cambios.




