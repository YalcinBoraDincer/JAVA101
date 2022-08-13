public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }
     void run(){

        if (isCheck()){
            while (this.f1.health>0 && this.f2.health>0){
                System.out.println("=========Yeni Round========= ");
                this.f2.health=this.f1.hit(this.f2);
                if (isWin()){
                    break;
                }
                this.f1.health=this.f2.hit(this.f1);
                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name+"Saglik : "+this.f1.health);
                System.out.println(this.f2.name+"Saglik : "+this.f2.health);


            }


        }else {
            System.out.println("Sporcularin Sikletleri Uymuyor ");
        }

    }
    boolean isCheck(){
        return(this.f1.weight >=minWeight && this.f1.weight<=maxWeight)&&(this.f2.weight >=minWeight && this.f2.weight<=maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Macı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Macı Kazanan : " + f1.name);
            return true;
        }

        return false;
    }
}
