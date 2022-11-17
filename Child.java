class GrandParent{
    String grandFatherName , grandMotherName;

    GrandParent(String a,String b){
        grandFatherName = a;
        grandMotherName = b;
        System.out.println("Grand father name is :"+grandFatherName);
        System.out.println("Grand father name is :"+grandMotherName);
    }
    
}

class Parent extends GrandParent{
    String FatherName , MotherName;
    Parent(String c, String d, String a, String b){
        super(a,b);
        FatherName = c;
        MotherName = d;

        System.out.println("Father name is: "+FatherName);
        System.out.println("Father name is: "+MotherName);
    }

}

class Child extends Parent{
    Child(String c, String d, String a, String b){
        super(c,d,a,b);
    }
    public static void main(String[] args) {
           Child ch = new Child("SANJAY", "SUMAN" ,"DINESHKUMAR","VIDYALATA");
    }

}
