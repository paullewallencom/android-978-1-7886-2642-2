// Generated code from Butter Knife. Do not modify!
package packt.reactivestocks;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  private View view2131427417;

  @UiThread
  public MainActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.helloText = Utils.findRequiredViewAsType(source, R.id.hello_world_salute, "field 'helloText'", TextView.class);
    target.noDataAvailableView = Utils.findRequiredViewAsType(source, R.id.no_data_available, "field 'noDataAvailableView'", TextView.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.stock_updates_recycler_view, "field 'recyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.start_another_activity_button, "method 'onStartAnotherActivityButtonClick'");
    view2131427417 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onStartAnotherActivityButtonClick(Utils.<Button>castParam(p0, "doClick", 0, "onStartAnotherActivityButtonClick", 0));
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.helloText = null;
    target.noDataAvailableView = null;
    target.recyclerView = null;

    view2131427417.setOnClickListener(null);
    view2131427417 = null;

    this.target = null;
  }
}
