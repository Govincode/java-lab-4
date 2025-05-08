class grandpa{
    int grandpaAmount = 12000;
    public int grandpaA(){
        return grandpaAmount;
    }
}
class parents extends grandpa{
    int ParentpaAmount = 10000;
    public int parentA(){
        return ParentpaAmount;
    }
}
class Children extends parents{
    int ChildrenAmount = 1000;
    public int ChildrenA(){
        return ChildrenAmount;
    }
}



class lab15{
    public static void main(String[] args) {
        Children obj = new Children();
        int children = obj.ChildrenA();
        int parent = obj.parentA();
        int grand =  obj.grandpaA();

        System.out.println("Total amount comibining children, parent and Grandpa : " + (children + parent + grand ));
    }
}