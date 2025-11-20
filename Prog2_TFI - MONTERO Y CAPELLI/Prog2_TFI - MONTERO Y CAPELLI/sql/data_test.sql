USE tfi_bdi;

-- Insert ejemplo de empresa
INSERT INTO empresas
(razon_social, cuit, actividad_principal, email, eliminado)
VALUES
('Empresa Demo SRL', '30-12345678-9', 'Software', 'demo@empresa.com', FALSE);

-- Insert domicilio fiscal vinculado a empresa_id = 1
INSERT INTO domicilios_fiscales
(empresa_id, calle, numero, ciudad, provincia, codigo_postal, pais, eliminado)
VALUES
(1, 'Av La Plata', 610, 'CABA', 'Buenos Aires', '1235', 'Argentina', FALSE);
