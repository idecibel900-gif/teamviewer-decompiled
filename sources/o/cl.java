package o;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cl {
    public final dl a;
    public final al b;
    public final al c;
    public final View d;

    public cl(dl dlVar, al alVar, al alVar2, View view) {
        this.a = dlVar;
        this.b = alVar;
        this.c = alVar2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        int i2;
        ep7 ep7Var = (ep7) this.b.a();
        final byte b = 0;
        if (im3.n(ep7Var, null)) {
            return false;
        }
        menu.clear();
        List list = ep7Var.a;
        int size = list.size();
        final byte b2 = 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        while (i3 < size) {
            dp7 dp7Var = (dp7) list.get(i3);
            if (dp7Var instanceof mp7) {
                i = i4 + 1;
                Object obj = dp7Var.a;
                if (im3.n(obj, ga0.n0)) {
                    i2 = R.id.cut;
                } else if (im3.n(obj, ga0.o0)) {
                    i2 = R.id.copy;
                } else if (im3.n(obj, ga0.p0)) {
                    i2 = R.id.paste;
                } else if (im3.n(obj, ga0.q0)) {
                    i2 = R.id.selectAll;
                } else {
                    i2 = im3.n(obj, ga0.r0) ? R.id.autofill : i4;
                }
                final mp7 mp7Var = (mp7) dp7Var;
                MenuItem menuItemAdd = menu.add(i5, i2, i4, mp7Var.b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o.bl
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        byte b3 = b;
                        Object obj2 = this;
                        Object obj3 = mp7Var;
                        switch (b3) {
                            case 0:
                                ((mp7) obj3).d.invoke(((cl) obj2).a);
                                break;
                            default:
                                Context context = (Context) obj3;
                                TextClassification textClassification = (TextClassification) obj2;
                                String text = textClassification.getText();
                                n67.q(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (dp7Var instanceof sp7) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i4 + 1;
                        final Context context = this.d.getContext();
                        sp7 sp7Var = (sp7) dp7Var;
                        final TextClassification textClassification = sp7Var.b;
                        int i6 = sp7Var.c;
                        Drawable drawable = sp7Var.d;
                        if (i6 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i4, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(drawable);
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o.bl
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    byte b3 = b2;
                                    Object obj2 = textClassification;
                                    Object obj3 = context;
                                    switch (b3) {
                                        case 0:
                                            ((mp7) obj3).d.invoke(((cl) obj2).a);
                                            break;
                                        default:
                                            Context context2 = (Context) obj3;
                                            TextClassification textClassification2 = (TextClassification) obj2;
                                            String text = textClassification2.getText();
                                            n67.q(PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592));
                                            break;
                                    }
                                    return true;
                                }
                            });
                        } else {
                            byte b3 = i6 == 0 ? (byte) 1 : b;
                            RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i6);
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, b3 != 0 ? 16908353 : b, i4, remoteAction.getTitle());
                            menuItemAdd3.setShowAsAction(b3 == 0 ? 0 : 2);
                            if (drawable != null) {
                                menuItemAdd3.setIcon(drawable);
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new xe0(remoteAction, (byte) 3));
                        }
                    }
                } else if (dp7Var instanceof qp7) {
                    i5++;
                }
                i3++;
                b = 0;
            }
            i4 = i;
            i3++;
            b = 0;
        }
        return true;
    }
}
