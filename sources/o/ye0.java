package o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo/ye0;", "Lo/zb0;", "Lo/bi3;", "Lo/hq4;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class ye0 extends zb0 implements bi3, hq4 {
    public static final /* synthetic */ int s0 = 0;

    public boolean H0() {
        return false;
    }

    public abstract boolean I0();

    public abstract boolean J0();

    public void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.buddylistgroup_trigger_search_menu, menu);
        boolean z = false;
        menu.findItem(R.id.action_trigger_search).setOnMenuItemClickListener(new xe0(this, (byte) 0));
        MenuItem menuItemFindItem = menu.findItem(R.id.buddy_list_fragment_settings_button);
        menuItemFindItem.setVisible(!I0());
        menuItemFindItem.setOnMenuItemClickListener(new xe0(this, (byte) 1));
        MenuItem menuItemFindItem2 = menu.findItem(R.id.buddy_list_fragment_subscribe_button);
        if (!J0() && H0()) {
            z = true;
        }
        menuItemFindItem2.setVisible(z);
        menuItemFindItem2.setOnMenuItemClickListener(new xe0(this, (byte) 2));
    }
}
