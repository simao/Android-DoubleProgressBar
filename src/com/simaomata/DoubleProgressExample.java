package com.simaomata;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.simaomata.common.DoubleProgressDialog;


/**
 * User: simao
 * Date: 2/25/11
 * Time: 23:52
 */
public class DoubleProgressExample extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DoubleProgressDialog progressDialog;

        progressDialog = new DoubleProgressDialog(this);
        progressDialog.setMessage("Double progress test");
        progressDialog.setCancelable(true);
        progressDialog.setButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        progressDialog.show();

        progressDialog.setProgress(64);
        progressDialog.setSecondaryProgress(32);
    }
}
