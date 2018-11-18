package com.kotlinpractise

import java.io.Serializable

class Models1 : Serializable {

    var Id:String="";
    var Name:String="";
    var Desciption:String="";
    var drawable:Int = -1;

    constructor(Id: String, Name: String, Desciption: String, drawable: Int) {
        this.Id = Id
        this.Name = Name
        this.Desciption = Desciption
        this.drawable = drawable
    }

    override fun toString(): String {
        return "Models1(Id='$Id', Name='$Name', Desciption='$Desciption', drawable=$drawable)"
    }

}