package collections.hashmap;

public class Student {
    private String CNP,name;

    public Student(String CNP, String name) throws CNPSizeException {
        if(CNP.length()!=0)
        {
            throw new CNPSizeException();
        }
        this.CNP = CNP;
        this.name=name;
    }

    public String getCNP() {
        return CNP;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString()
    {
        return "Student{" + CNP +'\'' +
                ", name='" + name + '\''+"}";
    }
   private class CNPSizeException extends Exception
    {
        public CNPSizeException()
        {
            super ("CNP does not respect the requirements.");
        }
    }
}
