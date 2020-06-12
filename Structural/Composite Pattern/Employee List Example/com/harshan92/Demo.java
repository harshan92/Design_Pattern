public class Demo {
    public static void main(String[] args) {
        Employee ceo=new Employee("Dave", "CEO", 1200);
        Employee headSale=new Employee("Pole", "Head Sale", 100);
        Employee headMarketing=new Employee("Mike", "Head Marketing", 100);
        Employee clerk1=new Employee("Jene", "clerk", 100);
        Employee clerk2=new Employee("Pole", "clerk", 100);

        Employee saleExecutive1=new Employee("Brams", "sale Executive", 120);
        Employee saleExecutive2=new Employee("Selina", "sale Executive", 120);

        ceo.add(headSale);
        ceo.add(headMarketing);

        headSale.add(saleExecutive1);
        headSale.add(saleExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(ceo);

        for(Employee emp:ceo.getSubordinates()){
            System.out.println("\t"+emp);
            for(Employee subEmp:emp.getSubordinates()){
                System.out.println("\t\t"+subEmp);
            }
        }
    }
}