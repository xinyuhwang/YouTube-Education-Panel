package youtube.service;

import youtube.model.NotePad;

public interface NotePadService {
	NotePad getNotePadById(int NotePadId);

	void deleteNotePad(int NotePadId);

	void addNotePad(NotePad notepad);

	void updateNotePad(NotePad notepad);
}
