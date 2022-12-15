package com.example.whishlist

object DataObject {
    var listdata = mutableListOf<TasksInfo>()

    fun setData(title: String){
        listdata.add(TasksInfo(title))
    }

    fun getAllData():List<TasksInfo>{
        return listdata
    }

    fun deleteAll(){
        listdata.clear()
    }

    fun getData(pos:Int): TasksInfo{
        return listdata[pos]
    }

    fun deleteData(pos: Int){
        listdata.removeAt(pos)
    }

    fun updateData(pos: Int, title: String){
        listdata[pos].title = title
    }

}