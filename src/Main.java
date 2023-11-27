public class Main {
    public static void main(String[] args) {

            // Crear instancias de las clases (puedes precargar algunas según sea necesario)

            Cliente cliente1 = new Cliente(123456, "Juan Perez", "Calle 123", "juan@gmail.com");
            Categoria categoria1 = new Categoria(1, "Mantenimiento");
            Tecnico tecnico1 = new Tecnico(101, "Carlos Gonzalez");

            // Alta de una orden
            Orden orden1 = new Orden(1, "Reparación de equipo", 200.0, new Date(), "Pendiente", cliente1, categoria1, tecnico1);

            // Listar todas las órdenes entre dos fechas determinadas
            listarOrdenesEntreFechas(new Date(2023, 10, 1), new Date(2023, 11, 30));

            // Puedes seguir agregando más órdenes, clientes, técnicos, etc., según sea necesario.
        }

        public static void listarOrdenesEntreFechas(Date fechaInicio, Date fechaFin) {
            // Implementar lógica para listar las órdenes entre las fechas especificadas
            // Puedes utilizar un bucle para recorrer la lista de órdenes y filtrar por fechas
        }
    }
