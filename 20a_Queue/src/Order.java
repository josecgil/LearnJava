import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Order
    {
        private static int nextID = 1;

        private int id=0;
        private Date date = new Date(); 
        
        public Order() {
            GenerateID();
        }

        public Order(String date) throws ParseException
        {
            GenerateID();
    			SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
            this.date = dateFormat.parse(date);
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
            return this.date;
        }

    }

