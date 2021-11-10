package memento;

import java.util.Date;

public class Project {
    String version;
    Date date;

    public void setVersionAndDate(String name) {
        this.version = name;
        this.date = new Date();
    }

    public Save save(){
        return new Save(version, date);
    }

    public void load(Save save){
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project " + version +
                ", date=" + date;

    }
}
