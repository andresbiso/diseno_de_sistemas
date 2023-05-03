# Comentarios
- Este proyecto hace uso de la base de datos h2. El .jar de la misma debe estar incluída en el classpath.
- Configuración H2: conn = DriverManager.getConnection("jdbc:h2:~/test;AUTO_SERVER=TRUE", "sa", "");

# Antes de levantar el proyecto
1. Levantar una instancia de h2 con h2/bin/h2w.bat
2. Logearse con los siguientes parámetros:
- Generic H2 (Embedded)
- Controlador: org.h2.Driver
- URL JDBC: jdbc:h2:~/test;AUTO_SERVER=TRUE
- Nombre de Usuario: sa
- Contraseña: [dejar vacía]
3. Correr el script llamado clase_9_ejemplo_script.sql para inicializar la base de datos.
4. Deberíamos ver la DB creada en el directorio del usuario de windows como test.mv.db
