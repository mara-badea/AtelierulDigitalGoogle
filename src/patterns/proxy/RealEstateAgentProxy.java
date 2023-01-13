package patterns.proxy;

public class RealEstateAgentProxy
{
       private Apartment apartment;
       public RealEstateAgentProxy(){}
       public void represent(Apartment apartament)
        {
                this.apartment=apartament;
        }
        public Apartment rent(Student student)
        {
                if(student.getName().charAt(0)=='P')
                {
                        return null;
                }
                else
                        return this.apartment;
        }
}
