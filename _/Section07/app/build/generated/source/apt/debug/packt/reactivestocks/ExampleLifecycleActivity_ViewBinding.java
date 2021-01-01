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

public class ExampleLifecycleActivity_ViewBinding<T extends ExampleLifecycleActivity> implements Unbinder {
  protected T target;

  @UiThread
  public ExampleLifecycleActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.textView = Utils.findRequiredViewAsType(source, R.id.example_hello_id, "field 'textView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.textView = null;

    this.target = null;
  }
}
