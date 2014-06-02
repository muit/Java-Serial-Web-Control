/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsc.websocket;

import javax.websocket.DecodeException;
import javax.websocket.EndpointConfig;
import javax.websocket.Encoder;
import javax.websocket.Decoder;
import javax.websocket.EncodeException;

/**
 *
 * @author Miguel_F
 */
public class Message {
    private String username;
    private String message;
    
    public Message() {}
    
    public Message( String username, String message ) {
        this.username = username;
        this.message = message;
    }
    public String getMessage() {return message;}
    public String getUsername() {return username;}
    public void setMessage( final String message ) {this.message = message;}
    public void setUsername( final String username ) {this.username = username;}
    
    public static class MessageEncoder implements Encoder.Text< Message > {
        public void init( final EndpointConfig config ) {
        }
        
        @Override
        public String encode( final Message message ) throws EncodeException {
            String coded = "";
            //ENCODE
            ////////
            return coded;
        }
        
        @Override
        public void destroy() {
        }
    }
    public static class MessageDecoder implements Decoder.Text< Message > {
   
        @Override
        public void init( final EndpointConfig config ) {
        }
   
        @Override
        public Message decode( final String str ) throws DecodeException {
            final Message message = new Message();
            //DECODE
            ////////
            return message;
        }
   
        @Override
        public boolean willDecode( final String str ) {
            return true;
        }
   
        @Override
        public void destroy() {
        }
    }
}
