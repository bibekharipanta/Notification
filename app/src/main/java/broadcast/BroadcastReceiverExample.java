package broadcast;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class BroadcastReceiverExample {
    @Override
    public void onRecive(Context context, Intent intent){
        boolean noConnectivity;

     if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){
         noConnectivity = intent.getBooleanExtra(
                 ConnectivityManager.EXTRA_NO_CONNECTIVITY,
                 false);


         if (noConnectivity){
             Toast.makeText(context, "Disconneted", Toast.LENGTH_SHORT).show();

         }else {
             Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();


                 }

             }
          }
       }
