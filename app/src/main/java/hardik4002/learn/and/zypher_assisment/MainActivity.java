package hardik4002.learn.and.zypher_assisment;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        setTextInUi();
    }

    private void setTextInUi() {
        textView=findViewById(R.id.textView);
        textView.setText("Java is a programming language and computing platform first released by Sun Microsystems in 1995."+"\n"+"\n"+
                "There are lots of applications and websites that will not work unless you have Java installed, and more are created every day. Java is fast, secure, and reliable. From laptops to datacenters, game consoles to scientific supercomputers, cell phones to the Internet, Java is everywhere!"+"\n"+"\n"+
        "The latest Java version contains important enhancements to improve performance, stability and security of the Java applications that run on your machine. Installing this free update will ensure that your Java applications continue to run safely and efficiently."+"\n"
        +""+"\n"
        +"The Java Runtime Environment (JRE) is what you get when you download Java software. The JRE consists of the Java Virtual Machine (JVM), Java platform core classes, and supporting Java platform libraries."+"\n"+"\n"
        +"Standalone applications are also known as desktop applications or window-based applications. These are traditional software that we need to install on every machine. Examples of standalone application are Media player, antivirus, etc. AWT and Swing are used in Java for creating standalone applications.");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       int id=item.getItemId();
       switch(id){
           case R.id.action_setting:
               BottomSheetDialog bottomSheetDialog=new BottomSheetDialog();
               bottomSheetDialog.show(getSupportFragmentManager(),"example");
               break;
       }
        return super.onOptionsItemSelected(item);
    }

    public void goToTabbedActivity(View view) {
        Intent intent=new Intent(this, TabbedActivity.class);
        startActivity(intent);
    }
}
