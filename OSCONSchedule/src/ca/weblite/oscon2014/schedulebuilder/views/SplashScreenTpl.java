/* THIS FILE IS AUTOMATICALLY GENERATED-- DO NOT MODIFY IT*/
package ca.weblite.oscon2014.schedulebuilder.views;

import com.codename1.ui.*;
import com.codename1.components.*;
import com.codename1.ui.layouts.*;
import com.codename1.ui.table.*;
import com.codename1.ui.util.*;

class SplashScreenTpl {

    private Container rootContainer;
    private Resources resources;

    public Container getRoot() {
        if (rootContainer == null) {
            try {
                rootContainer = buildUI();
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex.getMessage());
            }
        }
        return rootContainer;
    }
    private java.util.Map<String, Component> _nameIndex = new java.util.HashMap<String, Component>();

    public Component get(String name) {
        getRoot();
        return _nameIndex.get(name);
    }

    public SplashScreenTpl(java.util.Map context) {
        for (Object o : context.values()) {
            if (o instanceof Resources) {
                resources = (Resources) o;
            }
        }
    }

    private Container buildUI() throws Exception {
        Container root = new Container();
        BorderLayout rootLayout = new BorderLayout();
        root.setLayout(rootLayout);
        root.setUIID("SplashBackground");
        Container node1 = new Container();
        FlowLayout node1Layout = new FlowLayout();
        node1.setLayout(node1Layout);
        node1.setUIID("SplashNorth");
        Label node2 = new Label();
        node2.setText("Open Event Schedule Demo");
        if (node2.getClientProperty("__CN1ML_NO_ADD__") == null && node1 != node2.getParent()) {
            node1.addComponent(node2);
        }
        if (node1.getClientProperty("__CN1ML_NO_ADD__") == null && root != node1.getParent()) {
            root.addComponent(BorderLayout.NORTH, node1);
        }
        Container node3 = new Container();
        BoxLayout node3Layout = new BoxLayout(BoxLayout.Y_AXIS);
        node3.setLayout(node3Layout);
        node3.setUIID("SplashMainContent");
        node3.setName("mainContent");
        _nameIndex.put("mainContent", node3);
        if (node3.getClientProperty("__CN1ML_NO_ADD__") == null && root != node3.getParent()) {
            root.addComponent(BorderLayout.CENTER, node3);
        }
        Container node4 = new Container();
        BoxLayout node4Layout = new BoxLayout(BoxLayout.Y_AXIS);
        node4.setLayout(node4Layout);
        node4.setUIID("SplashLoading");
        Label node5 = new Label();
        node5.setUIID("LoadingText");
        node5.setText("Loading Schedule ...");
        if (node5.getClientProperty("__CN1ML_NO_ADD__") == null && node4 != node5.getParent()) {
            node4.addComponent(node5);
        }
        if (node4.getClientProperty("__CN1ML_NO_ADD__") == null && root != node4.getParent()) {
            root.addComponent(BorderLayout.SOUTH, node4);
        }
        return root;
    }

    public Container getMainContent() {
        return (Container) get("mainContent");
    }
}
