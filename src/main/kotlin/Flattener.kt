object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        val mutableListOf = mutableListOf<Any>()
        for (el in source){
            if (el == null){
                continue
            } else if(el is Collection<Any?>) {
                mutableListOf.addAll(flatten(el))
            } else {
                mutableListOf.add(el)
            }
        }
        return mutableListOf
    }
}