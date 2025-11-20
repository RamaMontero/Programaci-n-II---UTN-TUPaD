
TRABAJO FINAL INTEGRADOR – PROGRAMACIÓN II
UTN – Tecnicatura Universitaria en Programación

========================================================

DOMINIO ELEGIDO:
Empresa (A) → DomicilioFiscal (B)
Relación 1→1 unidireccional (Empresa contiene un DomicilioFiscal)

========================================================

1. REQUISITOS DEL PROYECTO

Software necesario:
- Java 21 o superior
- MySQL Server 8.0
- MySQL Workbench 8.0 (opcional)
- MySQL Connector/J 8 o 9 (incluido en el proyecto)
- NetBeans / IntelliJ / Eclipse

Base de datos utilizada:
- Nombre: tfi_bdi
- Motor: MySQL 8.0
- Usuario por defecto: root (configurable)
- Conexión definida en: /src/config/db.properties


========================================================

2. CREACIÓN DE LA BASE DE DATOS (SQL)


Ejecutar los siguientes archivos SQL incluidos en la carpeta /sql:

1) create_tables.sql  
   - Crea la base tfi_bdi
   - Crea tablas:
       • empresas
       • domicilios_fiscales
   - Configura relación 1→1 con FOREIGN KEY UNIQUE
   - Incluye índices y restricciones

2) data_test.sql  
   - Inserta una empresa inicial
   - Inserta un domicilio fiscal asociado
   - Permite iniciar la app con datos listos para probar el CRUD


========================================================

3. CONFIGURACIÓN DE LA CONEXIÓN (db.properties)


El archivo se encuentra en:
src/config/db.properties

Debe contener:

db.url=jdbc:mysql://localhost:3306/tfi_bdi?useSSL=false&allowPublicKeyRetrieval=true
db.user=root
db.password=[SU_PASSWORD]

(Si el usuario o la contraseña difieren en su PC, modificarlos aquí.)


========================================================

4. EJECUCIÓN DEL PROYECTO


1) Abrir el proyecto en NetBeans / IntelliJ  
2) Verificar que MySQL Server esté iniciado  
3) Ejecutar la clase:
   • src/main/TestConexion.java
   Debe mostrar:
   "Connected successfully to tfi_bdi"

4) Ejecutar el menú principal:
   • src/main/AppMenu.java

El menú permite:
1. Crear Empresa
2. Listar Empresas
3. Modificar Empresa
4. Eliminar (baja lógica)
5. Buscar Empresa por CUIT
6. Salir

Incluye:
- Manejo de excepciones
- CRUD completo
- Validaciones básicas
- Relación 1→1 garantizada
- Transacciones con rollback automático en CUIT duplicado


========================================================

5. DATOS DE PRUEBA INCLUIDOS

Luego de ejecutar data_test.sql se cargará:

EMPRESA:
• Razón Social: Empresa Demo SRL
• CUIT: 30-12345678-9
• Actividad: Software
• Email: demo@empresa.com

DOMICILIO FISCAL:
• Calle: Av La Plata 610
• Ciudad: CABA
• Provincia: Buenos Aires
• CP: 1235
• País: Argentina

Esto permite probar de inmediato:
- Lectura
- Búsqueda por CUIT
- Modificación
- Eliminación lógica


========================================================

6. VIDEO DE PRESENTACIÓN

Enlace al video (YouTube):
👉 https://www.youtube.com/watch?v=WYDWzjLUIy4


========================================================

7. EJECUCIÓN DESDE CERO (PASO A PASO)


1. Clonar el repositorio
2. Abrir MySQL Workbench
3. Ejecutar create_tables.sql
4. Ejecutar data_test.sql
5. Modificar db.properties con usuario/contraseña local
6. Ejecutar TestConexion.java
7. Ejecutar AppMenu.java
8. Probar CRUD completo + rollback por CUIT duplicado

========================================================

