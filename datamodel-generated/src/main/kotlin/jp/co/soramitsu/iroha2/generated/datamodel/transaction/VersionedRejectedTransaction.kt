// Do not change. Autogenerated code
package jp.co.soramitsu.iroha2.generated.datamodel.transaction

import kotlin.Int
import kotlin.String

/**
 * VersionedRejectedTransaction
 *
 * Matched to enum in Rust
 */
public abstract class VersionedRejectedTransaction {
  public companion object {
    public const val IROHA_FULL_NAME: String =
        "iroha_data_model::transaction::VersionedRejectedTransaction"
  }

  /**
   * 'V1' variant
   */
  public class V1(
    private val v1: _VersionedRejectedTransactionV1
  ) : VersionedRejectedTransaction() {
    public companion object {
      public const val DISCRIMINANT: Int = 1
    }
  }
}