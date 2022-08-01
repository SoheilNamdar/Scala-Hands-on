object One {

   // extractName(string) and return a tuple
   def extractName(fullname: String): (String, String) = {
      val nameSplit = fullname.split(" ")
      var tupleResult: (String, String) = "" -> ""

      if( nameSplit.length == 1){
         tupleResult = nameSplit(0) -> "";
      }else if(nameSplit.length == 2){
         tupleResult = nameSplit(0) -> nameSplit(1);
      }else if(nameSplit.length ==3 ){
         tupleResult = nameSplit(0) -> nameSplit(2);
      }else{
         tupleResult = nameSplit(0) -> fullname.stripPrefix(nameSplit(0).stripPrefix(nameSplit(1)));
      }
      return tupleResult;
   }
   def main(args: Array[String]) = {
      var name = "John Smith"
      println(f"sample : $name%s")
      var result = extractName(name);
      var (firstname,lastname) = result;

      println(f"the firstname is : $firstname%s and the lastname is $lastname%s")

      name = "John"
      println(f"sample : $name%s")
      result = extractName(name);
      var (firstname1,lastname1) = result;

      println(f"the firstname is : $firstname1%s and the lastname is $lastname1%s")

      name = "John Adam Smith"
      println(f"sample : $name%s")
      result = extractName(name);
      var (firstname2,lastname2) = result;

      println(f"the firstname is : $firstname2%s and the lastname is $lastname2%s")

   }
}