import ErrorPage from "./ErrorPage";
import React, {Component} from "react";

class ErrorBoundary extends Component {
  state = {
    error: null
  }

  static getDerivedStateFromError(error) {
    // Update state so next render shows fallback UI.
    return { error: error };
  }

  componentDidCatch(error, info) {
    // Log the error to an error reporting service
    console.log(error, info);
  }

  render() {
    if (this.state.error) {
      // You can render any custom fallback UI
      return <ErrorPage text="rest"/>;
    }
    return this.props.children;
  }
};
export default ErrorBoundary;