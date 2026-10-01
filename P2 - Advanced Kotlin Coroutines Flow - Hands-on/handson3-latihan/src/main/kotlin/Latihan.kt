import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// Hands-on 3: StateFlow untuk Counter
// Tugas: Implementasikan counter sederhana menggunakan StateFlow.
// Counter harus bisa increment, decrement, dan reset.
//
// CATATAN: File ini belum bisa dijalankan sampai kamu melengkapi
// semua TODO di bawah — itu normal untuk latihan ini!

class CounterManager {
    // TODO: Buat MutableStateFlow dengan nilai awal 0
    // private val _count = ???

    // TODO: Expose sebagai StateFlow (read-only)
    // val count: StateFlow<Int> = ???

    private val _count = MutableStateFlow(0)

    val count: StateFlow<Int> = _count.asStateFlow()

    fun increment() {
        _count.value++
    }

    fun decrement() {
        if (_count.value > 0) {
            _count.value--
        }
    }

    fun reset() {
        _count.value = 0
    }
}

fun main() = runBlocking {

    val counter = CounterManager()

    // Collect di background
    launch {
        counter.count.collect {
            println("Count: $it")
        }
    }

    counter.increment()
    counter.increment()
    counter.decrement()
    counter.reset()
}