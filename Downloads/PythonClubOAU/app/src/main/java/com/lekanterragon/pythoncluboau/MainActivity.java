package com.lekanterragon.pythoncluboau;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.blunderer.materialdesignlibrary.activities.NavigationDrawerActivity;
import com.blunderer.materialdesignlibrary.handlers.ActionBarDefaultHandler;
import com.blunderer.materialdesignlibrary.handlers.ActionBarHandler;
import com.blunderer.materialdesignlibrary.handlers.NavigationDrawerAccountsHandler;
import com.blunderer.materialdesignlibrary.handlers.NavigationDrawerAccountsMenuHandler;
import com.blunderer.materialdesignlibrary.handlers.NavigationDrawerBottomHandler;
import com.blunderer.materialdesignlibrary.handlers.NavigationDrawerStyleHandler;
import com.blunderer.materialdesignlibrary.handlers.NavigationDrawerTopHandler;
import com.blunderer.materialdesignlibrary.models.Account;
import com.lekanterragon.pythoncluboau.Fragments.CardViewFragment;
import com.lekanterragon.pythoncluboau.Fragments.ClubDetailsFragment;

public class MainActivity extends NavigationDrawerActivity {


    @Override
    public NavigationDrawerStyleHandler getNavigationDrawerStyleHandler() {
        return new NavigationDrawerStyleHandler();
    }

    @Override
    public NavigationDrawerAccountsHandler getNavigationDrawerAccountsHandler() {
        return new NavigationDrawerAccountsHandler(this)
                .addAccount("Profile 1", "profile1@gmail.com",
                        R.drawable.profile1, R.drawable.profile1_background);
    }

    @Override
    public NavigationDrawerAccountsMenuHandler getNavigationDrawerAccountsMenuHandler() {
        return new NavigationDrawerAccountsMenuHandler(this)
                .addAddAccount(new Intent(getApplicationContext(), AddAccountActivity.class))
                .addManageAccounts(new Intent(getApplicationContext(), ManageAccountsActivity.class));
    }

    @Override
    public void onNavigationDrawerAccountChange(Account account) {
        Toast.makeText(getApplicationContext(), "Account changed!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public NavigationDrawerTopHandler getNavigationDrawerTopHandler() {
        return new NavigationDrawerTopHandler(this)
                .addItem(R.string.news, new CardViewFragment())
                .addItem(R.string.fun_facts, new Intent (this, FunFactActivity.class))
                .addItem(R.string.meet_the_club, new ClubDetailsFragment());
    }

    @Override
    public NavigationDrawerBottomHandler getNavigationDrawerBottomHandler() {
        return new NavigationDrawerBottomHandler(this)
                .addSettings(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                        startActivity(intent);
                    }

                })
                .addHelpAndFeedback(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), HelpAndFeedbackActivity.class);
                        startActivity(intent);
                    }

                });
    }

    @Override
    public boolean overlayActionBar() {
        return true;
    }

    @Override
    public boolean replaceActionBarTitleByNavigationDrawerItemTitle() {
        return true;
    }

    @Override
    public int defaultNavigationDrawerItemSelectedPosition() {
        return 1;
    }

    @Override
    protected boolean enableActionBarShadow() {
        return true;
    }

    @Override
    protected ActionBarHandler getActionBarHandler() {
        return new ActionBarDefaultHandler(this);
    }
}
