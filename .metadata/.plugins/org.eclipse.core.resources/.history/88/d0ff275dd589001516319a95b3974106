import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Order
    {
        //contador de IDs a generar, almacena el siguiente ID que da al próximo
        //pedido creado
        private static int nextID = 1;

        private int id=0;
        private Date fecha = new Date(); //por defecto, la fecha de creación del objeto

        public Order() {
            GenerateID();
        }

        public Order(String fecha) throws ParseException
        {
            GenerateID();
    			SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
            this.fecha = dateFormat.parse(fecha);
        }

        private void GenerateID()
        {
            this.id = nextID;
            nextID++;
        }

        public int getId()
        {
            return this.id;
        }

        public Date getDate()
        {
            return this.fecha;
        }

    }

