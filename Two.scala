object Two{
    // maxPopulation will receive array of tuples as city input, and return string city that have max  population
    def maxPopulation(city: Array[(String, String)]): String = {

        scala.util.Sorting.stableSort(city,(e1: (String, String), e2: (String, String)) => e1._2 > e2._2)

        val (result,_) = city(0)
        return result;
    }

    // sortCityCount will receive array of tuples as city input and count of city returned, sorted by population size
    def sortCityCount(city: Array[(String, String)], count: Int): Array[(String,String)] = {
        scala.util.Sorting.stableSort(city,(e1: (String, String), e2: (String, String)) => e1._2 > e2._2)
        val cities = city.take(count)
        return cities
    }

    // findCity will receive array of tuples as city input, and return string city that found
    def findCity(city: Array[(String, String)], input: String): String = {

        var search = true
        var searchResult: String = ""
        for ( x <- city if search) {
            if( x._1 == input){
                search = false
                searchResult = x._1
            }
        }
        return searchResult
    }

    def main(args: Array[String]) = {

        val initialCity = Array(("Abilene (TX)","125182"), ("Akron (OH)","190469"), ("Albuquerque (NM)","564559"), ("Alexandria (VA)","159467"), ("Allen (TX)","104627"), ("Allentown (PA)","125845"), ("Amarillo (TX)","200393"), ("Anaheim (CA)","346824"), ("Anchorage (AK)","291247"), ("Ann Arbor (MI)","123851"), ("Antioch (CA)","115291"), ("Arlington (TX)","394266"), ("Arlington (VA)","238643"), ("Arvada (CO)","124402"), ("Athens (GA)","127315"), ("Atlanta (GA)","498715"), ("Augusta (GA)","202081"), ("Aurora (CO)","386261"), ("Aurora (IL)","180542"), ("Austin (TX)","961855"), ("Bakersfield (CA)","403455"), ("Baltimore (MD)","585708"), ("Baton Rouge (LA)","227470"), ("Beaumont (TX)","115282"), ("Bellevue (WA)","151854"), ("Berkeley (CA)","124321"), ("Billings (MT)","117116"), ("Birmingham (AL)","200733"), ("Boise City (ID)","235684"), ("Boston (MA)","675647"), ("Brandon (FL)","114626"), ("Boulder (CO)","108250"), ("Bridgeport (CT)","148654"), ("Brockton (MA)","105643"), ("Broken Arrow (OK)","113540"), ("Brownsville (TX)","186738"), ("Buffalo (NY)","278349"), ("Burbank (CA)","107337"), ("Carlsbad (CA)","114746"), ("Cambridge (MA)","118403"));
        // Print all the array elements

        println("get one city with Max Population : "+ maxPopulation(initialCity))

        var result = findCity(initialCity,"Cambridge (MA)")
        println("find city with name Cambridge (MA) and found, the result : "+result)
        result = findCity(initialCity,"anyone")
        println("find city with name anyone and not found, the result are  : "+result)

        val resultCount = sortCityCount(initialCity,20)

        var count = 0
        println("Sort 20 Biggest City Population : ")
        for (k <- resultCount ){
            count = count + 1
            println(f"$count%s ) -> $k%s")
        }
    }
}