import org.scalatest.FunSuite

import model.BeatUtils._

class Tests extends FunSuite {
    val quantizations = Map(
        (3.1234, 2) -> 3,
        (3.125, 4) -> 3.25,
        (3.1234, 8) -> 3.125, // Rounding up

        (3.9, 2) -> 4, // 4 is null
        (3.6, 2) -> 3.5, // Rounding down
    )

    test("quantize should round to the nearest beat-part") {
        for {((beat, quantizeBy), result) <- quantizations}
            assert(quantize(beat, quantizeBy) == result)
    }
}