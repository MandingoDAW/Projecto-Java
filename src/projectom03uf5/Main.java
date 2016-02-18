/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectom03uf5;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] agrs) {
        Test test = new Test("test.mid");
        creacioXML xml = new creacioXML(test.getKeySong(),test.getKeyChar());
        Piano piano = new Piano("song.xml");
    }
}
