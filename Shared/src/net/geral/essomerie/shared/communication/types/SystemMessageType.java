package net.geral.essomerie.shared.communication.types;

import net.geral.essomerie._shared.UserPermission;
import net.geral.essomerie.shared.communication.IMessageType;

public enum SystemMessageType implements IMessageType {
  RequestLogin,
  Ping,
  Pong,
  Processed,
  InformLoginAccepted,
  InformLoginFailed,
  InformVersion,
  InformError;

  @Override
  public UserPermission requires() {
    return null;
  }

  @Override
  public String toEnglish() {
    switch (this) {
      case InformVersion:
        return "Uploading version information...";
      case Ping:
        return "Pinging...";
      case Pong:
        return "Pong!";
      case RequestLogin:
        return "Logging in...";
      default:
        return null;
    }
  }
}
