package com.taskThree.partOne;

/**
 * Created by Nataliia on 13.10.2018.
 */
public class DataSource {
    public static Toy[] getToys(){
        return new Toy[]{
                new Doll(46,"1-2 years","Barby",45,true),
                new Doll(128,"8-13 years","Baby Dolls",50,true),
                new Doll(23,"5-7 years","Fashion Dolls",20,true),
                new Doll(38,"2-4 years","Fashion Dolls",25,false),
                new Doll(18,"1-2 years","Baby Dolls",30,true),
                new Constructor(46,"2-4 years","Blocks Building Sets",45,"wood"),
                new Constructor(88,"8-13 years","Gear Sets",50,"plastic"),
                new Constructor(73,"5-7 years","Lego",20,"plastic"),
                new Constructor(24,"8-13 years","Gear Sets",25,"metal"),
                new Constructor(22,"2-4 years","Lego",30,"plastic"),
                new SoftToy(28,"2-4 years","Musical Soft Toys",32,"Faux Fur"),
                new SoftToy(26,"5-7 years","Pets And Animals",24,"Felt"),
                new SoftToy(38,"8-13 years","Pets And Animals",32,"Fleece"),
                new SoftToy(40,"1-2 years","Teddy Bear",45,"Faux Fur")
        };
    }
}
