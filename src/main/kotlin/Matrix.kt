class Matrix(private val matrixAsString: String) {
    val matrix : MutableList<List<Int>> = mutableListOf()
    init {
        val rows = matrixAsString.split("\n")
        for (row in rows){
            matrix.add(row.split(" ").map { x -> x.toInt() }.toList())
        }
    }

    fun column(colNr: Int): List<Int> {
        return matrix.map { r -> r.get(colNr) }.toList()
    }

    fun row(rowNr: Int): List<Int> {
        return matrix.get(rowNr)
    }
}
