class Matrix() {
    constructor(list : List<List<Int>>) : this(){
        for (row in list){
            matrix.add(row)
        }
    }

//    val saddlePoints: MutableList<MatrixCoordinate> = mutableListOf()
    val matrix : MutableList<List<Int>> = mutableListOf()
    constructor(matrixAsString: String) : this(){
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
val Matrix.saddlePoints: Set<MatrixCoordinate>
    get() {
        val points = mutableListOf<MatrixCoordinate>()
        val minimas = mutableListOf<Int>()
        for (j in 0..matrix.get(0).size - 1){
            var min = Int.MAX_VALUE
            for (i in 0..matrix.size-1) {
                min = Math.min(min, matrix[i][j])
            }
            minimas.add(min)
        }
        this.matrix.forEachIndexed { i, row ->
            val candidates = mutableListOf<MatrixCoordinate>()
            var rowMax : Int = -1
            row.forEachIndexed{ j, el ->
                if (el > rowMax) {
                    candidates.clear()
                    candidates.add(MatrixCoordinate(i+1, j+1))
                    rowMax = el
                } else if (el == rowMax) {
                    candidates.add(MatrixCoordinate(i+1, j+1))
                }
            }
            for (c in candidates){
                if(matrix[c.row-1][c.col-1] == minimas[c.col-1]){
                    points.add(c)
                }
            }

        }
        return points.toSet()
    }
