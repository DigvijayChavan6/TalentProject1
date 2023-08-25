class em{
    int bs,hr,it,da;
    String eno,ename,jdate,dep,des;
    em(String e,String n,String jd,String de,String ds,int b,int h, int i, int a){
        this.eno=e;
        this.bs=b;
        this.hr=h;
        this.it=i;
        this.da=a;
        this.ename=n;
        this.jdate=jd;
        this.dep=de;
        this.des=ds;
    }
}
class emp{
    public static void main(String[] args) {
        em o1=new em("1001","Ashish","01/04/2009","R&D","Engineer",20000,8000,3000,20000);
        em o2=new em("1002","Sushma","23/08/2012","PM","Consultant",30000,12000,9000,32000);
        em o3=new em("1003","Rahul","12/11/2008","Acct","Clerk",10000,8000,1000,12000);
        em o4=new em("1004","Chahat","29/01/2013","Front Desk","Receptionist",12000,6000,2000,15000);
        em o5=new em("1005","Ranjan","16/07/2005","Engg","Manager",50000,20000,20000,40000);
        em o6=new em("1006","Suman","1/1/2000","Manufacturing","Engineer",23000,9000,4400,20000);
        em o7=new em("1007","Tanmay","12/06/2006","PM","Consultant",29000,12000,10000,32000);
        em []e={o1,o2,o3,o4,o5,o6,o7};
        System.out.println("| Emp. no.    |   Emp. Name  |   Department  |  Designation  |   Salary  |\n");
        for(int i=0;i<args.length;i++){
            int t=0;
            for(int j=0;j<e.length;j++){
                if(args[i].equals(e[j].eno)){
                    System.out.println("  "+e[j].eno+"\t\t"+e[j].ename+"\t\t"+e[j].dep+"\t\t"+e[j].des+"\t\t"+(e[j].bs+e[j].da+e[j].hr-e[j].it));
                    t=1;
                }
            }
            if(t==0)System.out.println("There is no employee with emp id : "+args[i]);
        }
        System.out.println();
    }
}