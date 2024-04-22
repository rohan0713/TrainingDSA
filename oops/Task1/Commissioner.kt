package oops.Task1

class Commissioner() {

    fun canArrest(person: String, spendingLimit: Int, permission: Boolean): String {
        if (person == "PM"){
            if (Expenses(person, spendingLimit).exceedsSpendingLimit()){
                return "PM Arrested"
            }
            return "Can not arrest";
        }
        else if (person == "Ministers"){
            if (!Expenses(person, spendingLimit).exceedsSpendingLimit()){
                return "Minister hasn't exceed their spending limit"
            }
            if(permission){
                return "Minister Arrested"
            }else{
                return "PM permission required"
            }
        }
        return "MP Arrested"
    }
}