DROP DATABASE IF EXISTS tfi_bdi;
CREATE DATABASE tfi_bdi CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;

USE tfi_bdi;

-- ================================
--  Tabla EMPRESAS
CREATE TABLE empresas (
    empresa_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    razon_social VARCHAR(120) NOT NULL,
    cuit VARCHAR(13) NOT NULL UNIQUE,
    actividad_principal VARCHAR(80),
    email VARCHAR(120),
    eliminado BOOLEAN DEFAULT FALSE
);

-- ================================
--  Tabla DOMICILIOS_FISCALES
--  Relación 1→1 unidireccional
--  empresa_id es UNIQUE

CREATE TABLE domicilios_fiscales (
    domicilio_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    empresa_id BIGINT UNIQUE,
    calle VARCHAR(100) NOT NULL,
    numero INT,
    ciudad VARCHAR(80) NOT NULL,
    provincia VARCHAR(80) NOT NULL,
    codigo_postal VARCHAR(10),
    pais VARCHAR(80) NOT NULL,
    eliminado BOOLEAN DEFAULT FALSE,

    CONSTRAINT fk_empresa_domicilio
        FOREIGN KEY (empresa_id)
        REFERENCES empresas(empresa_id)
        ON DELETE CASCADE
);

