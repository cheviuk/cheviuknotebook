
/**
 * Created by cheviuk on 04.09.2015.
 * cheviuknotebook
 *
 *
 *
 **/

import notebook.*;

class CheviukNotebook {

    /**
     *
     * @param args - not used
     */
   public static void main(final String[] args) {

       NotebookModel notebookModel = new NotebookModel();
       NotebookController notebookController = new NotebookController(notebookModel);
       NotebookView notebookView = new NotebookView(notebookController);
       notebookView.mainMenu();
   }
}