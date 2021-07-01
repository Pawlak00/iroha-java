// Do not change. Autogenerated code
package jp.co.soramitsu.schema.generated.datamodel.expression

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import kotlin.Unit

/**
 * Subtract
 *
 * Generated from 'iroha_data_model::expression::Subtract' regular structure
 */
public class Subtract(
  private val left: EvaluatesTo,
  private val right: EvaluatesTo
) {
  public companion object : ScaleReader<Subtract>, ScaleWriter<Subtract> {
    public override fun read(reader: ScaleCodecReader): Subtract =
        Subtract(jp.co.soramitsu.schema.generated.datamodel.expression.EvaluatesTo.read(reader),
        jp.co.soramitsu.schema.generated.datamodel.expression.EvaluatesTo.read(reader))

    public override fun write(writer: ScaleCodecWriter, instance: Subtract): Unit {
      jp.co.soramitsu.schema.generated.datamodel.expression.EvaluatesTo.write(writer,
          instance.`left`)
      jp.co.soramitsu.schema.generated.datamodel.expression.EvaluatesTo.write(writer,
          instance.`right`)
    }
  }
}