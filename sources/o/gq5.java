package o;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class gq5 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    public final Preference m;

    public gq5(Preference preference) {
        this.m = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.m;
        CharSequence charSequenceE = preference.e();
        if (!preference.N || TextUtils.isEmpty(charSequenceE)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceE);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.m;
        Context context = preference.m;
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        CharSequence charSequenceE = preference.e();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceE));
        Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceE), 0).show();
        return true;
    }
}
