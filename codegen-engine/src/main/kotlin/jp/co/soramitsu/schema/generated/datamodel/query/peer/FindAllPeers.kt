// Do not change. Autogenerated code
package jp.co.soramitsu.schema.generated.datamodel.query.peer

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import kotlin.Unit

/**
 * FindAllPeers
 *
 * Generated from 'iroha_data_model::query::peer::FindAllPeers' regular structure
 */
public class FindAllPeers {
  public companion object : ScaleReader<FindAllPeers>, ScaleWriter<FindAllPeers> {
    public override fun read(reader: ScaleCodecReader): FindAllPeers = FindAllPeers()

    public override fun write(writer: ScaleCodecWriter, instance: FindAllPeers): Unit {
    }
  }
}