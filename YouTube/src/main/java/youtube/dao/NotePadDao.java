package youtube.dao;

import youtube.model.*;

public interface NotePadDao {
	NotePad getNotePadById(int notePadId);
	
	void deleteNotePad(int notePadId);
	
	void addNotePad(NotePad notePad);
	
	void updateNotePad(NotePad notePad);
}
