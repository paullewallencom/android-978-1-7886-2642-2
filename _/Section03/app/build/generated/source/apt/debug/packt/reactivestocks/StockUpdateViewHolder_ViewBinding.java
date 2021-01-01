// Generated code from Butter Knife. Do not modify!
package packt.reactivestocks;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StockUpdateViewHolder_ViewBinding<T extends StockUpdateViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public StockUpdateViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.stockSymbol = Utils.findRequiredViewAsType(source, R.id.stock_item_symbol, "field 'stockSymbol'", TextView.class);
    target.date = Utils.findRequiredViewAsType(source, R.id.stock_item_date, "field 'date'", TextView.class);
    target.price = Utils.findRequiredViewAsType(source, R.id.stock_item_price, "field 'price'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.stockSymbol = null;
    target.date = null;
    target.price = null;

    this.target = null;
  }
}
