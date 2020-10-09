package yeti.dreambot.aio;

import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import yeti.dreambot.aio.framework.task.Module;

@ScriptManifest(author = "yeeter01", category = Category.MISC, name = "DreamBot AIO AIO", version = 0.01)
public class Script extends AbstractScript {

	private Module currentModule = null;

	@Override
	public int onLoop() {
		return currentModule.execute();
	}

}
