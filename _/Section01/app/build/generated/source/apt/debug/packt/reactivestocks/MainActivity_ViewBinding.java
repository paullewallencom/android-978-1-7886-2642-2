// Generated code from Butter Knife. Do not modify!
package packt.reactivestocks;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  @UiThread
  public MainActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.helloText = Utils.findRequiredViewAsType(source, R.id.hello_world_salute, "field 'helloText'", TextView.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.stock_updates_recycler_view, "field 'recyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.helloText = null;
    target.recyclerView = null;

    this.target = null;
  }
}
