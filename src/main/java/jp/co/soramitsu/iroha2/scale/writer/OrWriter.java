package jp.co.soramitsu.iroha2.scale.writer;

import io.emeraldpay.polkaj.scale.ScaleCodecWriter;
import io.emeraldpay.polkaj.scale.ScaleWriter;
import java.io.IOException;
import jp.co.soramitsu.iroha2.model.Or;

public class OrWriter implements ScaleWriter<Or> {

  private static final ExpressionWriter EXPRESSION_WRITER = new ExpressionWriter();

  @Override
  public void write(ScaleCodecWriter writer, Or value) throws IOException {
    writer.write(EXPRESSION_WRITER, value.getLeft());
    writer.write(EXPRESSION_WRITER, value.getRight());
  }

}