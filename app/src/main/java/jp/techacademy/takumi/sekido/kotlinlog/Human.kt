package jp.techacademy.takumi.sekido.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable {

    var hobby: String

    constructor(name: String, age: Int, hobby: String) :super(name, age) {
        this.hobby = hobby
    }

    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳）")
    }

    override fun think() {
       Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }

}