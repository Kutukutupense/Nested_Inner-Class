//Kotlin'de nested ve inner sınıflar, sınıf içinde tanımlanan sınıfları ifade eder, ancak bazı farklılıklara sahiptirler.

//Nested Class: Kapsayıcı sınıfın üyelerine doğrudan erişemez. Bağımsız bir sınıf gibidir.
//Varsayılan olarak, bir sınıf içinde tanımlanan sınıflar nested sınıf olarak kabul edilir.  Bu sınıflar,
//kapsayıcı sınıfın bir örneğine erişemezler. Kapsayıcı sınıfın örnek verilerine ve fonksiyonlarına doğrudan erişimleri yoktur.


//Inner Class: inner anahtar kelimesi ile tanımlanır ve kapsayıcı sınıfın üyelerine erişebilir.
//Bir sınıfın içinde tanımlanan ve inner anahtar kelimesiyle belirtilen sınıflar inner sınıflar olarak adlandırılır.
//inner sınıflar, kapsayıcı sınıfın bir örneğine erişebilir ve onun üyelerine doğrudan erişebilirler.



class Outer1 {                        // nested class örneği
    private val bar: Int = 1

    class Nested {
        fun foo() = 2                 //kapsayıcı sınıfın 'bar' değişkenine erişemez  istersen '2' yerine bar koy dene.
    }


}
class Outer2 {                       //inner class örneği
    private val bar: Int = 1

    inner class Inner {
        fun foo() = bar  // Kapsayıcı sınıfın 'bar' değişkenine erişebilir
    }
}


fun main() {
    val nested = Outer1.Nested().foo()  // Çıktı: 2

    val inner = Outer2().Inner().foo()  // Çıktı: 1
}







